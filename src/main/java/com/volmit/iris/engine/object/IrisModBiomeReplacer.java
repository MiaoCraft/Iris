/*
 * Iris is a World Generator for Minecraft Bukkit Servers
 * Copyright (c) 2021 Arcane Arts (Volmit Software)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.volmit.iris.engine.object;

import com.volmit.iris.engine.object.annotations.*;
import com.volmit.iris.engine.object.IrisBiome;
import com.volmit.iris.util.collection.KList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Snippet("biome-replacer")
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Desc("A biome replacer")
@Data
public class IrisModBiomeReplacer {
    @Required
    @Desc("A list of biomes to find")
    @RegistryListResource(IrisBiome.class)
    @ArrayType(type = String.class, min = 1)
    private KList<String> find = new KList<>();

    @Required
    @Desc("A biome to replace it with")
    @RegistryListResource(IrisBiome.class)
    private String replace = "";
}
