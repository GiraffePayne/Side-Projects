package me.giraffe.joinleave;

import org.bukkit.event.Listener;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListenber implements Listener {

    //Event handler to detect when player joins/leaves
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        //Initializes the player as one to detect for events
        Player player = e.getPlayer();

        /*Reads config and stores a data value under "Unique"
          to keep track of every unique account that has joined
         */
        int unique = JoinLeave.getPlugin(JoinLeave.class).getConfig().getInt("Unique");

        //Checks if the joining player is a new, or returning player
        if(player.hasPlayedBefore()) {
            //If returning, displays the message in chat
            e.setJoinMessage("[" + ChatColor.GREEN + "+" + ChatColor.WHITE + "] " + ChatColor.DARK_GREEN + player.getName());
        } else {
            //If new, creates custom message and adds to the unique player value
            e.setJoinMessage(ChatColor.BLUE + "" + ChatColor.BOLD + "Welcome "
                    + ChatColor.GREEN + player.getName() + ChatColor.BLUE + "" + ChatColor.BOLD + " to the server! "
                    + ChatColor.WHITE + "(#" + ChatColor.YELLOW + unique + ChatColor.WHITE + ")");

            //Writing in config to keep track of unique players
            JoinLeave.getPlugin(JoinLeave.class).getConfig().set("Unique", unique + 1);
            unique = JoinLeave.getPlugin(JoinLeave.class).getConfig().getInt("Unique");
            JoinLeave.getPlugin(JoinLeave.class).saveDefaultConfig();
        }
    }
    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        //Initializes the player as one to detect for events
        Player player = e.getPlayer();

        //Custom message for players leaving the server
        e.setQuitMessage("[" + ChatColor.RED + "-" + ChatColor.WHITE + "] " + ChatColor.DARK_RED + player.getName());
    }
}

