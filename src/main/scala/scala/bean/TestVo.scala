package scala.bean

import scala.beans.BeanProperty

class TestVo {
  // class 里的属性默认是private类型，object里的属性默认是static
  @BeanProperty var id = 10
  @BeanProperty var name = null
  @BeanProperty var addr = null
}
