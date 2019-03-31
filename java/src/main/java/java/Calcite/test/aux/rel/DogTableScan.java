package java.Calcite.test.aux.rel;


import org.apache.calcite.plan.*;
import org.apache.calcite.rel.core.TableScan;
import org.apache.calcite.rel.metadata.RelMetadataQuery;

public class DogTableScan extends TableScan implements DogRel {
	public DogTableScan(RelOptCluster cluster, RelTraitSet traitSet, RelOptTable table) {
		super(cluster, traitSet, table);
	}

	@Override
	public RelOptCost computeSelfCost(RelOptPlanner planner, RelMetadataQuery mq) {
		return super.computeSelfCost(planner, mq);
	}
}
