package io.quarkus.reactive.datasource.runtime;

import java.util.Optional;
import java.util.OptionalInt;

import io.quarkus.runtime.annotations.ConfigItem;
import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;
import io.quarkus.vertx.core.runtime.config.JksConfiguration;
import io.quarkus.vertx.core.runtime.config.PemKeyCertConfiguration;
import io.quarkus.vertx.core.runtime.config.PemTrustCertConfiguration;
import io.quarkus.vertx.core.runtime.config.PfxConfiguration;

/**
 * For now, the reactive extensions only support a default datasource.
 */
@ConfigRoot(name = "datasource.reactive", phase = ConfigPhase.RUN_TIME)
public class DataSourceReactiveRuntimeConfig {

    /**
     * The datasource URL.
     */
    @ConfigItem
    public Optional<String> url;

    /**
     * The datasource pool maximum size.
     */
    @ConfigItem
    public OptionalInt maxSize;

    /**
     * Whether all server certificates should be trusted.
     */
    @ConfigItem(defaultValue = "false")
    public boolean trustAll;

    /**
     * Trust configuration in the PEM format.
     * <p>
     * When enabled, {@link #trustCertificateJks} and {@link #trustCertificatePfx} must be disabled.
     */
    @ConfigItem
    public PemTrustCertConfiguration trustCertificatePem;

    /**
     * Trust configuration in the JKS format.
     * <p>
     * When enabled, {@link #trustCertificatePem} and {@link #trustCertificatePfx} must be disabled.
     */
    @ConfigItem
    public JksConfiguration trustCertificateJks;

    /**
     * Trust configuration in the PFX format.
     * <p>
     * When enabled, {@link #trustCertificateJks} and {@link #trustCertificatePem} must be disabled.
     */
    @ConfigItem
    public PfxConfiguration trustCertificatePfx;

    /**
     * Key/cert configuration in the PEM format.
     * <p>
     * When enabled, {@link #keyCertificateJks} and {@link #keyCertificatePfx} must be disabled.
     */
    @ConfigItem
    public PemKeyCertConfiguration keyCertificatePem;

    /**
     * Key/cert configuration in the JKS format.
     * <p>
     * When enabled, {@link #keyCertificatePem} and {@link #keyCertificatePfx} must be disabled.
     */
    @ConfigItem
    public JksConfiguration keyCertificateJks;

    /**
     * Key/cert configuration in the PFX format.
     * <p>
     * When enabled, {@link #keyCertificateJks} and {@link #keyCertificatePem} must be disabled.
     */
    @ConfigItem
    public PfxConfiguration keyCertificatePfx;
}
