package com.minecolonies.api.entity.citizen.citizenhandlers;

import com.minecolonies.api.entity.ai.Status;
import net.minecraft.network.chat.Component;

public interface ICitizenStatusHandler
{
    /**
     * Get the latest status of the citizen.
     *
     * @return a Component with the length 4 describing it.
     */
    Component[] getLatestStatus();

    /**
     * Set the latest status of the citizen and clear the existing status
     *
     * @param status the new status to set.
     */
    void setLatestStatus(Component... status);

    /**
     * Append to the existing latestStatus list. This will override the oldest one if full and move the others one down in the array.
     *
     * @param status the latest status to append
     */
    void addLatestStatus(Component status);

    /**
     * Getter for the current status.
     *
     * @return the status.
     */
    Status getStatus();

    /**
     * Setter for the current status.
     *
     * @param status the status to set.
     */
    void setStatus(Status status);
}
