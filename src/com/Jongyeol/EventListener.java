package com.Jongyeol;

import com.Jongyeol.EndcityProtect.nocanmove;
import com.Jongyeol.PingServerUpdate.Ping;
import com.Jongyeol.PingServerUpdate.Update;
import com.Jongyeol.fixpermission.evs;
import com.Jongyeol.fixpermission.ivs;
import com.Jongyeol.spanwprotect.*;
import com.Jongyeol.warp.GUIClick;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.*;
import org.bukkit.event.server.ServerListPingEvent;

public class EventListener implements Listener {
    @EventHandler
    public void onPlace(BlockPlaceEvent event) {
        Placeblock.PlaceBlock(event);
    }
    @EventHandler
    public void onBreak(BlockBreakEvent event) {
        Breakblock.BreakBlock(event);
    }
    @EventHandler
    public void onDamage(EntityDamageEvent event) {
        Damage.Damage(event);
    }
    @EventHandler
    public void OnExplosion(ExplosionPrimeEvent event) {
        Explosion.Explosion(event);
    }
    @EventHandler
    public void OnDrop(PlayerDropItemEvent event) { NoItemDrop.ItemDrop(event); }
    @EventHandler
    public void OnFishing(PlayerFishEvent event) { NoFishingHook.FishingHook(event); }
    @EventHandler
    public void OnMove(PlayerMoveEvent event) { nocanmove.nocanmove(event); }
    @EventHandler
    public void OnCommand(PlayerCommandPreprocessEvent event) {
        ivs.Command(event);
        evs.Command(event);
    }
    @EventHandler
    public void OnPing(ServerListPingEvent event) { Ping.onPing(event); }
    @EventHandler
    public void OnJoin(PlayerJoinEvent event) { Update.Join(event); }
    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) { GUIClick.ClickEvent(event); }
    @EventHandler
    public void OnEntitySpawn(EntitySpawnEvent event) { spawn.entityspawn(event); }
    @EventHandler
    public void water(PlayerBucketFillEvent event) { Breakblock.Water(event); }
    @EventHandler
    public void water2(PlayerBucketEmptyEvent event) { Placeblock.Water(event); }
}
