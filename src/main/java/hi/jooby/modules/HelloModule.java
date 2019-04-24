package hi.jooby.modules;

import com.google.inject.Binder;
import com.typesafe.config.Config;
import org.jooby.Env;
import org.jooby.Jooby;

public class HelloModule implements Jooby.Module {

  /**
   * Configure and produces bindings for the underlying application. A module can optimize or
   * customize a service by checking current the {@link Env application env} and/or the current
   * application properties available from {@link Config}.
   *
   * @param env The current application's env. Not null.
   * @param conf The current config object. Not null.
   * @param binder A guice binder. Not null.
   * @throws Throwable If something goes wrong.
   */
  @Override
  public void configure(Env env, Config conf, Binder binder) throws Throwable {

  }
}
