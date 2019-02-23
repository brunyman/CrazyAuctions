package me.badbones69.crazyauctions.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

/**
 *
 * @author BadBones69
 *
 * This event is fired when a bidding item's time has run out and so a player wins the item.
 *
 */
public class AuctionWinBidEvent extends Event {
	
	private Player player;
	private String seller;
	private long bid;
	private ItemStack item;
	private static final HandlerList handlers = new HandlerList();
	
	/**
	 *
	 * @param player
	 * @param item
	 * @param bid
	 */
	public AuctionWinBidEvent(Player player, ItemStack item, long bid, String sellerName) {
		this.player = player;
		this.seller = sellerName;
		this.item = item;
		this.bid = bid;
	}
	
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
		return handlers;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public ItemStack getItem() {
		return item;
	}
	
	public long getBid() {
		return bid;
	}
	
	public String getSellerName() {
		return seller;
	}
	
}