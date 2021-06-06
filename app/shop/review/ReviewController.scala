package shop.review

import play.api.mvc.{AnyContent, BaseController, ControllerComponents, Request}

import javax.inject.{Inject, Singleton}

@Singleton
class ReviewController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def create = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def read = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def update(reviewId: String) = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def delete(reviewId: String) = Action { implicit request: Request[AnyContent] =>
    ???
  }
}