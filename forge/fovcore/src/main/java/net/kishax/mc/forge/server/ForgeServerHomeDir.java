package net.kishax.mc.forge.server;

import java.nio.file.Path;

import com.google.inject.Inject;

import net.kishax.mc.common.server.interfaces.ServerHomeDir;

public class ForgeServerHomeDir implements ServerHomeDir {
  private final Path configPath;
  @Inject
  public ForgeServerHomeDir(Path configPath) {
    this.configPath = configPath;
  }

  @Override
  public String getServerName() {
    return configPath.getParent().getFileName().toString();
  }
}
