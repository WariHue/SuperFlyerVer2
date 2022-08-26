package com.github.warihue.superflyer

import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.event.EventHandler
import org.bukkit.entity.Damageable
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.event.player.PlayerJoinEvent


abstract class SuperFlayer : JavaPlugin(){

    var pBoard = HashMap<String, Player>()
    override fun onEnable() {
        println('잉')
    }
    fun setPlayer(p : Player, pM : String){
        pBoard.put(pM, p)
        p.damage(10.00, p)
    }
    @EventHandler
    fun interect(pla : PlayerJoinEvent){
        var p : Player
        p = pla.player
        setPlayer(p, p.name)
    }

}