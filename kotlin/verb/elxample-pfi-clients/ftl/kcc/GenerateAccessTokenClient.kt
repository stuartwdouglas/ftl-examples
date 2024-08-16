package ftl.kcc

import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="generateAccessToken",
  module="kcc",
)
public interface GenerateAccessTokenClient :
    VerbClient<HttpRequest<GenerateTokenRequest>, HttpResponse<GenerateTokenResponse, OAuthTokenError>>
    {
  public override fun call(`value`: HttpRequest<GenerateTokenRequest>):
      HttpResponse<GenerateTokenResponse, OAuthTokenError>
}
