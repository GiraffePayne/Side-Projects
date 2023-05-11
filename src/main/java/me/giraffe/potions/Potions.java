package me.giraffe.potions;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class Potions extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }
    //Creates variables for each potion effect type to determine
    //if they are active effects or not
    boolean activeSpeed = false;
    boolean activeSpeed2 = false;
    boolean activeFireRes = false;
    boolean activeJumpBoost = false;
    boolean activeNV = false;
    boolean activeWB = false;
    boolean activeJumpBoost2 = false;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        //Checks for command input from the player
        if(command.getName().equalsIgnoreCase("speed")) {

            //Checks if player has this command currently active, if not,
            //it is activated
            if (sender instanceof Player && activeSpeed == false) {
                Player p = (Player) sender;
                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, -1, 0, false, false));
                p.sendMessage(ChatColor.AQUA + "Effect Activated!");

                activeSpeed = true;
                activeSpeed2 = false;

            //Checks if player has command currently activated, if so,
            //it turns of the command after typing the same command to activate it
            } else if (sender instanceof Player && activeSpeed == true) {
                Player p = (Player) sender;
                p.removePotionEffect(PotionEffectType.SPEED);
                p.sendMessage(ChatColor.RED + "Effect removed!");

                activeSpeed = false;
                activeSpeed2 = false;
            }
        }
        //Checks for command input from the player
        if(command.getName().equalsIgnoreCase("speed 2")) {

            //Checks if player has this command currently active, if not,
            //it is activated
            if (sender instanceof Player && activeSpeed2 == false) {
                Player p = (Player) sender;
                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, -1, 2, false, false));
                p.sendMessage(ChatColor.AQUA + "Effect Activated!");

                //Resets boolean for both speed 1 and 2
                activeSpeed2 = true;
                activeSpeed = false;

                //Checks if player has command currently activated, if so,
                //it turns of the command after typing the same command to activate it
            } else if (sender instanceof Player && activeSpeed2 == true) {
                Player p = (Player) sender;
                p.removePotionEffect(PotionEffectType.SPEED);
                p.sendMessage(ChatColor.RED + "Effect removed!");

                activeSpeed2 = false;
                activeSpeed = false;
            }
        }

        if(command.getName().equalsIgnoreCase("fireres")) {

            if (sender instanceof Player && activeFireRes == false) {
                Player p = (Player) sender;
                p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, -1, 0, false, false));
                p.sendMessage(ChatColor.AQUA + "Effect Activated!");

                activeFireRes = true;

            } else if (sender instanceof Player && activeFireRes == true) {
                Player p = (Player) sender;
                p.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
                p.sendMessage(ChatColor.RED + "Effect removed!");

                activeFireRes = false;
            }
        }

        if(command.getName().equalsIgnoreCase("nv")) {

            if (sender instanceof Player && activeNV == false) {
                Player p = (Player) sender;
                p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, -1, 0, false, false));
                p.sendMessage(ChatColor.AQUA + "Effect Activated!");

                activeNV = true;

            } else if (sender instanceof Player && activeNV == true) {
                Player p = (Player) sender;
                p.removePotionEffect(PotionEffectType.NIGHT_VISION);
                p.sendMessage(ChatColor.RED + "Effect removed!");

                activeNV = false;
            }
        }

        if(command.getName().equalsIgnoreCase("nightvision")) {

            if (sender instanceof Player && activeNV == false) {
                Player p = (Player) sender;
                p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, -1, 0, false, false));
                p.sendMessage(ChatColor.AQUA + "Effect Activated!");

                activeNV = true;

            } else if (sender instanceof Player && activeNV == true) {
                Player p = (Player) sender;
                p.removePotionEffect(PotionEffectType.NIGHT_VISION);
                p.sendMessage(ChatColor.RED + "Effect removed!");

                activeNV = false;
            }
        }

        if(command.getName().equalsIgnoreCase("wb")) {

            if (sender instanceof Player && activeWB == false) {
                Player p = (Player) sender;
                p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, -1, 0, false, false));
                p.sendMessage(ChatColor.AQUA + "Effect Activated!");

                activeWB = true;

            } else if (sender instanceof Player && activeWB == true) {
                Player p = (Player) sender;
                p.removePotionEffect(PotionEffectType.WATER_BREATHING);
                p.sendMessage(ChatColor.RED + "Effect removed!");

                activeWB = false;
            }
        }

        if(command.getName().equalsIgnoreCase("waterbreathing")) {

            if (sender instanceof Player && activeWB == false) {
                Player p = (Player) sender;
                p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, -1, 0, false, false));
                p.sendMessage(ChatColor.AQUA + "Effect Activated!");

                activeWB = true;

            } else if (sender instanceof Player && activeWB == true) {
                Player p = (Player) sender;
                p.removePotionEffect(PotionEffectType.WATER_BREATHING);
                p.sendMessage(ChatColor.RED + "Effect removed!");

                activeWB = false;
            }
        }

        if(command.getName().equalsIgnoreCase("jumpboost")) {

            if (sender instanceof Player && activeJumpBoost == false) {
                Player p = (Player) sender;
                p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, -1, 0, false, false));
                p.sendMessage(ChatColor.AQUA + "Effect Activated!");

                activeJumpBoost = true;
                activeJumpBoost2 = false;

            } else if (sender instanceof Player && activeJumpBoost == true) {
                Player p = (Player) sender;
                p.removePotionEffect(PotionEffectType.JUMP);
                p.sendMessage(ChatColor.RED + "Effect removed!");

                activeJumpBoost = false;
                activeJumpBoost2 = false;
            }
        }

        if(command.getName().equalsIgnoreCase("jumpboost 2")) {

            if (sender instanceof Player && activeJumpBoost2 == false) {
                Player p = (Player) sender;
                p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, -1, 1, false, false));
                p.sendMessage(ChatColor.AQUA + "Effect Activated!");

                activeJumpBoost2 = true;
                activeJumpBoost = false;

            } else if (sender instanceof Player && activeJumpBoost2 == true) {
                Player p = (Player) sender;
                p.removePotionEffect(PotionEffectType.JUMP);
                p.sendMessage(ChatColor.RED + "Effect removed!");

                activeJumpBoost2 = false;
                activeJumpBoost = false;
            }
        }

        //Adds a command to display the URL attached to the server
        if(command.getName().equalsIgnoreCase("wiki")) {

            if(sender instanceof Player) {
                Player p = (Player) sender;
                p.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "---------------------------------------------\n"
                        + "               <<  " + ChatColor.WHITE + "Wiki.AstralTowns.com" + ChatColor.LIGHT_PURPLE + ChatColor.BOLD
                        + "  >>\n" + "---------------------------------------------");
            }
        }
        //Adds a command to display the URL attached to the server
        if(command.getName().equalsIgnoreCase("store")) {

            if(sender instanceof Player) {
                Player p = (Player) sender;
                p.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "---------------------------------------------\n"
                        + "                <<  " + ChatColor.WHITE + "Store.AstralTowns.com" + ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD
                        + "  >>\n" + "---------------------------------------------");
            }
        }
        //Adds a command to display the URL attached to the server
        if(command.getName().equalsIgnoreCase("discord")) {

            if(sender instanceof Player) {
                Player p = (Player) sender;
                p.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "---------------------------------------------\n"
                        + "             <<  " + ChatColor.WHITE + "https://discord.gg/FJRZDn94" + ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD
                        + "  >>\n" + "---------------------------------------------");
            }
        }

        return true;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
