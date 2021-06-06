package shop.order

import play.api.mvc._

import javax.inject.{Inject, Singleton}

@Singleton
class OrderController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def create = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def read = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def update(orderId: String) = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def delete(orderId: String) = Action { implicit request: Request[AnyContent] =>
    ???
  }
}
