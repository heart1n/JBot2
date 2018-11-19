
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class EventListener extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event)
    {
        User user = event.getAuthor();
        MessageChannel messageChannel = event.getChannel();
        Message message = event.getMessage();

        if(message.getContentRaw().equalsIgnoreCase("!ping"))
        {
            messageChannel.sendMessage(user.getAsMention() + " Test BOT").queue();
        }
    }
}
