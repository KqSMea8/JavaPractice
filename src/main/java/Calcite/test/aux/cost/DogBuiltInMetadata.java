package Calcite.test.aux.cost;/*
 * Author: park.yq@alibaba-inc.com
 * Date: 2018/10/18 下午9:41
 */

import org.apache.calcite.plan.RelOptCost;
import org.apache.calcite.rel.RelNode;
import org.apache.calcite.rel.metadata.*;
import org.apache.calcite.rex.RexNode;
import org.apache.calcite.util.BuiltInMethod;

public abstract class DogBuiltInMetadata extends BuiltInMetadata {


	//total cost of something
	public interface TotalCost extends Metadata {
		MetadataDef<TotalCost> DEF = MetadataDef.of(DogBuiltInMetadata.TotalCost.class,
				DogBuiltInMetadata.TotalCost.Handler.class, BuiltInMethod.SELECTIVITY.method);

		RelOptCost getTotalCost(RexNode predicate);

		/** Handler API. */
		interface Handler extends MetadataHandler<TotalCost> {
			RelOptCost getTotalCost(RelNode r, RelMetadataQuery mq);
		}
	}
}
