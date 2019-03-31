package java.Calcite.test.aux.rel;


import org.apache.calcite.plan.Convention;
import org.apache.calcite.rel.RelNode;

//show final relnode implemnt dog
public interface DogRel extends RelNode {
	Convention CONVENTION = new Convention.Impl("Dog", DogRel.class);
}
