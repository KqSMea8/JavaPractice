package Calcite.test.aux.cost;



import Calcite.test.aux.rel.DogProject;
import Calcite.test.aux.rel.DogTableScan;
import org.apache.calcite.plan.RelOptCost;
import org.apache.calcite.plan.volcano.RelSubset;
import org.apache.calcite.rel.RelNode;
import org.apache.calcite.rel.metadata.*;
import org.apache.calcite.util.BuiltInMethod;

public class DogCumulativeCost implements MetadataHandler<BuiltInMetadata.CumulativeCost> {

	public static final RelMetadataProvider SOURCE =
			ReflectiveRelMetadataProvider.reflectiveSource(
					BuiltInMethod.CUMULATIVE_COST.method, new DogCumulativeCost());

	public DogCumulativeCost() {
	}

	@Override
	public MetadataDef<BuiltInMetadata.CumulativeCost> getDef() {
		return BuiltInMetadata.CumulativeCost.DEF;
	}

	public RelOptCost getCumulativeCost(DogTableScan tableScan, RelMetadataQuery query) {
		//
		return tableScan.getCluster().getPlanner().getCostFactory().makeCost(20000, 10, 1);
	}

	public RelOptCost getCumulativeCost(DogProject dogProject, RelMetadataQuery query) {
		//
		RelNode input = dogProject.getInput();

		RelOptCost inputCost;
		if (input instanceof RelSubset) {
			//inputCost = ((RelSubset) input)
		}

		return dogProject.getCluster().getPlanner().getCostFactory().makeCost(20000, 10, 1);
	}



}
