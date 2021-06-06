package shop.cart

import play.api.mvc.{AnyContent, BaseController, ControllerComponents, Request}

import javax.inject.{Inject, Singleton}

@Singleton
class CartController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def create = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def read = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def update(cartId: String) = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def delete(cartId: String) = Action { implicit request: Request[AnyContent] =>
    ???
  }
}