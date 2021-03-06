package commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.awt.*;

public class help implements runinterface {
    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

       event.getTextChannel().sendMessage(
                new EmbedBuilder().setColor(Color.BLACK)
                        .setTitle("Code:Neo Command List")
                        .setDescription("__**BOT RELATED**__\n``cn:help``, ``cn:github``, ``cn:servercount``, ``cn:usercount``, ``cn:bugreport``, ``cn:info``\n\n" +
                                        "__**MODERATION**__\n``cn:kick``, ``cn:ban``, ``cn:mute``, ``cn:unmute``\n\n" +
                                        "__**SERVER**__\n``cn:serverinfo``\n\n" +
                                        "__**FUN**__\n``cn:say``\n\n" +
                                        "__**GAME STATS**__\n``cn:paladins``\n\n" +
                                        "__**MUSIC**__\n``cn:music <play/skip/now/stop>``")
                        .setFooter("Created by " + event.getJDA().getUserById("265849018662387712").getName(), event.getJDA().getUserById("265849018662387712").getAvatarUrl())
                        .build()).queue();

    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }
}
