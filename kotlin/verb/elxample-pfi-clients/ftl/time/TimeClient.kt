package ftl.time

import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="time",
  module="time",
)
public interface TimeClient : VerbClient<TimeRequest, TimeResponse> {
  public override fun call(`value`: TimeRequest): TimeResponse
}
