/*
 * This file is part of Nucleus, licensed under the MIT License (MIT). See the LICENSE.txt file
 * at the root of this project for more details.
 */
package io.github.nucleuspowered.nucleus.modules.mute;

import io.github.nucleuspowered.nucleus.annotationprocessor.RegisterPermissions;
import io.github.nucleuspowered.nucleus.internal.permissions.PermissionMetadata;
import io.github.nucleuspowered.nucleus.internal.permissions.SuggestedLevel;

@RegisterPermissions
public class MutePermissions {
    private MutePermissions() {
        throw new AssertionError("Nope");
    }

    @PermissionMetadata(descriptionKey = "permission.base", replacements = { "checkmute" }, level = SuggestedLevel.MOD)
    public static final String BASE_CHECKMUTE = "checkmute.base";

    @PermissionMetadata(descriptionKey = "permission.base", replacements = { "checkmuted" }, level = SuggestedLevel.ADMIN)
    public static final String BASE_CHECKMUTED = "checkmuted.base";

    @PermissionMetadata(descriptionKey = "permission.base", replacements = { "globalmute" }, level = SuggestedLevel.ADMIN)
    public static final String BASE_GLOBALMUTE = "globalmute.base";

    @PermissionMetadata(descriptionKey = "permission.voice.auto", level = SuggestedLevel.ADMIN)
    public static final String VOICE_AUTO = "globalmute.voice.auto";

    @PermissionMetadata(descriptionKey = "permission.base", replacements = { "voice" }, level = SuggestedLevel.ADMIN)
    public static final String BASE_VOICE = "globalmute.voice.base";

    @PermissionMetadata(descriptionKey = "permission.voice.notify", level = SuggestedLevel.ADMIN)
    public static final String VOICE_NOTIFY = "globalmute.voice.notify";

    @PermissionMetadata(descriptionKey = "permission.base", replacements = { "mute" }, level = SuggestedLevel.MOD)
    public static final String BASE_MUTE = "mute.base";

    @PermissionMetadata(descriptionKey = "permission.mute.exempt.length", level = SuggestedLevel.ADMIN)
    public static final String MUTE_EXEMPT_LENGTH = "mute.exempt.length";

    @PermissionMetadata(descriptionKey = "permission.mute.exempt.target", level = SuggestedLevel.MOD)
    public static final String MUTE_EXEMPT_TARGET = "mute.exempt.target";

    @PermissionMetadata(descriptionKey = "permission.mute.notify", level = SuggestedLevel.MOD)
    public static final String MUTE_NOTIFY = "mute.notify";

    @PermissionMetadata(descriptionKey = "permission.mute.seemutedchat", level = SuggestedLevel.ADMIN)
    public static final String MUTE_SEEMUTEDCHAT = "mute.seemutedchat";

    @PermissionMetadata(descriptionKey = "permission.mute.unmute", level = SuggestedLevel.MOD)
    public static final String MUTE_UNMUTE = "mute.unmute";

}
