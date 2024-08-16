package ftl.kcc

import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="generatePreAuthCode",
  module="kcc",
)
public interface GeneratePreAuthCodeClient :
    VerbClient<GeneratePreAuthCodeRequest, GeneratePreAuthCodeResponse> {
  public override fun call(`value`: GeneratePreAuthCodeRequest): GeneratePreAuthCodeResponse
}
