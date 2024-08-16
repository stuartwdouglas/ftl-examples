package ftl.offerings

import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="calculateRate",
  module="offerings",
)
public interface CalculateRateClient : VerbClient<CalculateRateRequest, CalculateRateResponse> {
  public override fun call(`value`: CalculateRateRequest): CalculateRateResponse
}
