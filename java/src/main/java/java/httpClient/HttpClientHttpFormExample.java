package java.httpClient;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This example demonstrates the use of {@link HttpPost} request method.
 * And sending HTML Form request parameters
 */

/**
 * 提交HTML表单参数示例
 * 该资源确认数据并返回一个JSON对象，只需将其打印到控制台。
 * 发送HTML表单参数时，通常应将内容类型设置为application/x-www-form-urlencoded，
 * 但Apache HttpClient会自动检测内容类型并相应地设置它。
 */
public class HttpClientHttpFormExample {

    public static void main(String... args) throws IOException {

        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {

            List<NameValuePair> form = new ArrayList<>();
            form.add(new BasicNameValuePair("foo", "bar"));
            form.add(new BasicNameValuePair("employee", "maxsu"));
            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(form, Consts.UTF_8);

            HttpPost httpPost = new HttpPost("http://httpbin.org/post");
            httpPost.setEntity(entity);
            System.out.println("Executing request " + httpPost.getRequestLine());

            // Create a custom response handler
            ResponseHandler<String> responseHandler = response -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 300) {
                    HttpEntity responseEntity = response.getEntity();
                    return responseEntity != null ? EntityUtils.toString(responseEntity) : null;
                } else {
                    throw new ClientProtocolException("Unexpected response status: " + status);
                }
            };
            String responseBody = httpclient.execute(httpPost, responseHandler);
            System.out.println("----------------------------------------");
            System.out.println(responseBody);
        }
    }
}