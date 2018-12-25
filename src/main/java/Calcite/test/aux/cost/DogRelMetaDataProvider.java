package Calcite.test.aux.cost;/*
 * Author: park.yq@alibaba-inc.com
 * Date: 2018/10/18 下午9:35
 */

import com.google.common.collect.ImmutableList;
import org.apache.calcite.rel.metadata.*;

public class DogRelMetaDataProvider extends ChainedRelMetadataProvider {
	public static final DogRelMetaDataProvider INSTANCE = new DogRelMetaDataProvider();


	public DogRelMetaDataProvider() {
		super(
				ImmutableList.of(
						RelMdPercentageOriginalRows.SOURCE,
						RelMdColumnOrigins.SOURCE,
						RelMdExpressionLineage.SOURCE,
						RelMdTableReferences.SOURCE,
						RelMdNodeTypes.SOURCE,
						RelMdRowCount.SOURCE,
						RelMdMaxRowCount.SOURCE,
						RelMdMinRowCount.SOURCE,
						RelMdUniqueKeys.SOURCE,
						RelMdColumnUniqueness.SOURCE,
						RelMdPopulationSize.SOURCE,
						RelMdSize.SOURCE,
						RelMdParallelism.SOURCE,
						RelMdDistribution.SOURCE,
						RelMdMemory.SOURCE,
						RelMdDistinctRowCount.SOURCE,
						RelMdSelectivity.SOURCE,
						RelMdExplainVisibility.SOURCE,
						RelMdPredicates.SOURCE,
						RelMdAllPredicates.SOURCE,
						RelMdCollation.SOURCE,
						DogCumulativeCost.SOURCE
				)
		);
	}
}
