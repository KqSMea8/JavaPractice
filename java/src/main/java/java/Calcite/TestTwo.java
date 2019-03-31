package java.Calcite;

import org.apache.calcite.sql.*;
import org.apache.calcite.sql.parser.SqlParseException;
import org.apache.calcite.sql.parser.SqlParser;

public class TestTwo {
    public static void main(String[] args) throws SqlParseException {

        // 可以通过SqlParser直接对sql语句作解析，返回的就是sql树。

        SqlParser sqlParser = SqlParser.create("select * from \"table\" where \"column\" > 1 limit 1");
        SqlNode sqlNode =  sqlParser.parseQuery();

        if(sqlNode instanceof SqlCall){
            if(sqlNode instanceof SqlBasicCall){
                SqlBasicCall basicCall = (SqlBasicCall) sqlNode;
                System.out.println(((SqlIdentifier)basicCall.operand(0)).getSimple());
                System.out.println(((SqlNumericLiteral)basicCall.operand(1)).getValue());
                System.out.println(basicCall.getKind());
            }
            System.out.println(sqlNode.getKind()+" -> "+sqlNode.getClass());
            SqlCall call = (SqlCall) sqlNode;
            for(SqlNode node: call.getOperandList()){
               // parse(node);
            }
        }
    }
}
