package commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ping extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
	event.getChannel().sendMessage("Hello world").queue();
    }
}
