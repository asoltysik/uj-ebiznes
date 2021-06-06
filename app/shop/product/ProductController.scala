package shop.product

import play.api.mvc.{AnyContent, BaseController, ControllerComponents, Request}

import javax.inject.{Inject, Singleton}

@Singleton
class ProductController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def create = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def read = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def update(productId: String) = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def delete(productId: String) = Action { implicit request: Request[AnyContent] =>
    ???
  }
}