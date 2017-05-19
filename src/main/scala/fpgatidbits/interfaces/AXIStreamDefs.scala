//package fpgatidbits.axi
//
//import Chisel._
//
//// Define simple extensions of the Chisel Decoupled interfaces,
//// with signal renaming to support auto inference of AXI stream interfaces in Vivado
//
//
//class AXIStreamMasterIF[T <: Data](gen: T) extends DecoupledIO(gen) {
//  override def cloneType: this.type = { new AXIStreamMasterIF(gen).asInstanceOf[this.type]; }
//}
//
//class AXIStreamSlaveIF[T <: Data](gen: T) extends DecoupledIO(gen) {
//  flip()
//
//  override def cloneType: this.type = { new AXIStreamSlaveIF(gen).asInstanceOf[this.type]; }
//}
