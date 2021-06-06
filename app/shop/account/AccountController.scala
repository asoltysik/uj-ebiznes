package shop.account

import play.api.mvc.{AnyContent, BaseController, ControllerComponents, Request}

import javax.inject.{Inject, Singleton}

@Singleton
class AccountController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def create = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def read = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def update(accountId: String) = Action { implicit request: Request[AnyContent] =>
    ???
  }

  def delete(accountId: String) = Action { implicit request: Request[AnyContent] =>
    ???
  }
}
