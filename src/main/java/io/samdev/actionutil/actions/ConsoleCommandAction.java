package io.samdev.actionutil.actions;

import io.samdev.actionutil.Action;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class ConsoleCommandAction implements Action
{
    public static void execute(Player player, String action)
    {
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), action);
    }
}
