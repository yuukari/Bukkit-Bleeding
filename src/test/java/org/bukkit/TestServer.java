package org.bukkit;

import com.avaje.ebean.config.ServerConfig;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.inventory.Recipe;
import org.bukkit.map.MapView;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.ServicesManager;
import org.bukkit.plugin.SimplePluginManager;
import org.bukkit.plugin.messaging.Messenger;
import org.bukkit.scheduler.BukkitScheduler;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Logger;

/**
 * A skeleton test server to run tests on.
 */
public class TestServer implements Server {
    private final PluginManager pluginManager = new SimplePluginManager(this, null);
    private static final Logger logger = Logger.getLogger("Bukkit");

    private static TestServer instance;

    public static TestServer getInstance() {
        if (instance == null) {
            instance = new TestServer();
        }
        return instance;
    }

    public TestServer() {
        Bukkit.setServer(this);
    }

    public String getName() {
        return "TestServer";
    }

    public String getVersion() {
        return "Testing";
    }

    public String getBukkitVersion() {
        return getClass().getPackage().getSpecificationVersion();
    }

    public Player[] getOnlinePlayers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getMaxPlayers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getPort() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getViewDistance() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getIp() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getServerName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getServerId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean getAllowEnd() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean getAllowNether() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean hasWhitelist() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setWhitelist(boolean value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Set<OfflinePlayer> getWhitelistedPlayers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void reloadWhitelist() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int broadcastMessage(String message) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getUpdateFolder() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public File getUpdateFolderFile() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Player getPlayer(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Player getPlayerExact(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Player> matchPlayer(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public PluginManager getPluginManager() {
        return pluginManager;
    }

    public BukkitScheduler getScheduler() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ServicesManager getServicesManager() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<World> getWorlds() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public World createWorld(String name, World.Environment environment) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public World createWorld(String name, World.Environment environment, long seed) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public World createWorld(String name, World.Environment environment, ChunkGenerator generator) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public World createWorld(String name, World.Environment environment, long seed, ChunkGenerator generator) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public World createWorld(WorldCreator creator) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean unloadWorld(String name, boolean save) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean unloadWorld(World world, boolean save) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public World getWorld(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public World getWorld(UUID uid) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public MapView getMap(short id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public MapView createMap(World world) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void reload() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Logger getLogger() {
        return logger;
    }

    public PluginCommand getPluginCommand(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void savePlayers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean dispatchCommand(CommandSender sender, String commandLine) throws CommandException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void configureDbConfig(ServerConfig config) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean addRecipe(Recipe recipe) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Map<String, String[]> getCommandAliases() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getSpawnRadius() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setSpawnRadius(int value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean getOnlineMode() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean getAllowFlight() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int broadcast(String message, String permission) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public OfflinePlayer getOfflinePlayer(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Set<String> getIPBans() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void banIP(String address) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void unbanIP(String address) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Set<OfflinePlayer> getBannedPlayers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Set<OfflinePlayer> getOperators() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public GameMode getDefaultGameMode() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setDefaultGameMode(GameMode mode) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ConsoleCommandSender getConsoleSender() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public File getWorldContainer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public OfflinePlayer[] getOfflinePlayers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Messenger getMessenger() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void sendPluginMessage(Plugin source, String channel, byte[] message) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Set<String> getListeningPluginChannels() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean useExactLoginLocation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
