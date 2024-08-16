package ftl.compliance

import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import ftl.types.ApiError
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="handleIncodeWebhook",
  module="compliance",
)
public interface HandleIncodeWebhookClient :
    VerbClient<HttpRequest<Notification>, HttpResponse<NotificationResponse, ApiError>> {
  public override fun call(`value`: HttpRequest<Notification>):
      HttpResponse<NotificationResponse, ApiError>
}
