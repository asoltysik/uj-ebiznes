package shop.category

import play.api.mvc.{AnyContent, BaseController, ControllerComponents, Request}

import javax.inject.{Inject, Singleton}

@Singleton
class CategoryController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def create = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def read = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def update(categoryId: String) = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def delete(categoryId: String) = Action { implicit request: Request[AnyContent] =>
    ???
  }
}