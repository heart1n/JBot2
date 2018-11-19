import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.io.File;

public class SkinListener extends ListenerAdapter {

    String name;

    public void onMessageReceived(MessageReceivedEvent event) {
        User user = event.getAuthor();
        MessageChannel messageChannel = event.getChannel();
        Message message = event.getMessage();

        try {
            if (message.getContentRaw().equalsIgnoreCase("!스킨")) {
                String actorName = "";
                switch (user.getName()) {
                    case "잠뜰":
                        actorName = "잠뜰";
                        break;
                    case "각별":
                        actorName = "각별";
                        break;
                    case "수현":
                        actorName = "수현";
                        break;
                    case "코아":
                        actorName = "코아";
                        break;
                    case "도티":
                        actorName = "도티";
                        break;
                }
                case "잠뜰":
                    messageChannel.sendFile(new File("skins/" + actorName + ".png")).queue();
                    messageChannel.sendMessage(user.getAsMention()).queue();
            }
        } catch (Exception e) {
            messageChannel.sendMessage("파일이 존재하지 않습니다.").queue();
        }


    /*    if (message.getContentRaw().equalsIgnoreCase("!스킨")) {
            String path = "skins/";
            File dir = new File(path);
            File[] result = dir.listFiles();
            for (File f : result) {
                messageChannel.sendFile(f).queue();
            }

            messageChannel.sendMessage(user.getAsMention()).queue();
            messageChannel.sendMessage("00").queue();

            System.out.println(user.getName());
        }
*/
    }

}
