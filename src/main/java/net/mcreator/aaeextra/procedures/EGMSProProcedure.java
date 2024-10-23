package net.mcreator.aaeextra.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

public class EGMSProProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getDisplayName().getString()).equals("clippedbyengie")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute if entity clippedbyengie run gamemode survival");
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("egmc, egmsp, egma for other modes"), true);
		} else if ((entity.getDisplayName().getString()).equals("[AAE Developer] clippedbyengie")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute if entity clippedbyengie run gamemode survival");
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("egmc, egmsp, egma for other modes"), true);
		} else if ((entity.getDisplayName().getString()).equals("Dev")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute if entity Dev run gamemode survival");
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("egmc, egmsp, egma for other modes"), true);
		} else if ((entity.getDisplayName().getString()).equals("[AAE Developer] Dev")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute if entity Dev run gamemode survival");
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("egmc, egmsp, egma for other modes"), true);
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Sorry! This command is limited to just Engie."), true);
		}
	}
}
