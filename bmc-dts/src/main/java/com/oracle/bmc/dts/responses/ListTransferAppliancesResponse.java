/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.responses;

import com.oracle.bmc.dts.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.015")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListTransferAppliancesResponse {

    /**
     *
     */
    private String opcRequestId;

    /**
     * The returned MultipleTransferAppliances instance.
     */
    private MultipleTransferAppliances multipleTransferAppliances;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListTransferAppliancesResponse o) {
            opcRequestId(o.getOpcRequestId());
            multipleTransferAppliances(o.getMultipleTransferAppliances());

            return this;
        }
    }
}
