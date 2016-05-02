package net.ilexiconn.llibrary.client.gui.config;

import net.ilexiconn.llibrary.server.util.IValue;

public class ConfigProperty<T> {
    private IValue<T> value;
    private ConfigPropertyType type;

    public ConfigProperty(IValue<T> value, ConfigPropertyType type) {
        this.value = value;
        this.type = type;
    }

    public T get() {
        return this.value.get();
    }

    public void set(T value) {
        this.value.set(value);
    }

    public ConfigPropertyType getType() {
        return this.type;
    }

    public enum ConfigPropertyType {
        COLOR_SELECTION, COLOR_MODE, CHECK_BOX;
    }
}
