package org.valkyrienskies.mod.fabric.common

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking
import net.fabricmc.fabric.api.networking.v1.PacketSender
import net.minecraft.client.MinecraftClient
import net.minecraft.client.network.ClientPlayNetworkHandler
import net.minecraft.network.PacketByteBuf
import org.valkyrienskies.mod.common.VSNetworking

object VSClientPlayChannelHandler : ClientPlayNetworking.PlayChannelHandler {
	override fun receive(
		client: MinecraftClient,
		handler: ClientPlayNetworkHandler,
		buf: PacketByteBuf,
		responseSender: PacketSender?
	) {
		VSNetworking.handleVSPacketClient(buf)
	}
}
