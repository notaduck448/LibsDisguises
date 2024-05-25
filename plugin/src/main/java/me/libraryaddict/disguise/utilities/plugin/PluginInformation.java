package me.libraryaddict.disguise.utilities.plugin;

import lombok.Getter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by libraryaddict on 20/06/2019.
 */
public class PluginInformation {
    @Getter
    private final long size;
    private final String userID;
    private final String resourceID;
    private final String downloadID;
    private final boolean premium;
    private final String version;
    private final String buildNumber;
    private final String buildDate;

    public PluginInformation(long size, String userID, String resourceID, String downloadID, boolean premium, String version,
                             String buildNumber, String buildDate) {
        this.size = size;
        this.userID = userID;
        this.resourceID = resourceID;
        this.downloadID = downloadID;
        this.premium = premium;
        this.version = version;
        this.buildNumber = buildNumber;
        this.buildDate = buildDate;
    }

    public String getUserID() {
        return userID;
    }

    public String getResourceID() {
        return resourceID;
    }

    public String getDownloadID() {
        return downloadID;
    }

    public boolean isPremium() {
        return true;
        //return premium;
    }

    public String getVersion() {
        return version;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public String getBuildDate() {
        return buildDate;
    }

    public Date getParsedBuildDate() {
        try {
            return new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(getBuildDate());
        } catch (Exception ignored) {
        }

        return null;
    }

    public boolean isLegit() {
        return true;
        //return getUserID().matches("\\d+") && !getUserID().equals("12345") && getResourceID().equals("32453") && getDownloadID().matches("-?\\d+");
    }
}
