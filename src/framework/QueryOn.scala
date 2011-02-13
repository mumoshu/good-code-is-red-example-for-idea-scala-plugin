package framework

class QueryOn[T >: Model] {
  def findById(id: Long): Option[T] = None
}
