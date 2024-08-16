package ftl.offerings

import ftl.builtin.Empty
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="seed",
  module="offerings",
)
public interface SeedClient : VerbClient<Empty, Empty> {
  public override fun call(`value`: Empty): Empty
}
