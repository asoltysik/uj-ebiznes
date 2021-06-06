package shop.question

import play.api.mvc.{AnyContent, BaseController, ControllerComponents, Request}

import javax.inject.{Inject, Singleton}

@Singleton
class QuestionController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def create = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def read = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def update(questionId: String) = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def delete(questionId: String) = Action { implicit request: Request[AnyContent] =>
    ???
  }
}