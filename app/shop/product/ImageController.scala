package shop.product

import play.api.mvc.{AnyContent, BaseController, ControllerComponents, Request}

import javax.inject.{Inject, Singleton}

@Singleton
class ImageController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def create = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def read = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def update(imageId: String) = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def delete(imageId: String) = Action { implicit request: Request[AnyContent] =>
    ???
  }
}