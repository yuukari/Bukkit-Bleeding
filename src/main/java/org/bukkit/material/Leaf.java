package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.TreeSpecies;

/**
 * Represents a leaf block
 */
public class Leaf extends Tree {
    public Leaf() {
        super(Material.LEAVES);
    }

    public Leaf(TreeSpecies species) {
        super(Material.LEAVES, species);
    }

    public Leaf(byte data) {
        super(Material.LEAVES, data);
    }

    /**
     * @return True if the leaves are permanent and will never decay.
     */
    public boolean isPermanent() {
        return (getData() & 0x4) > 0;
    }

    /**
     * @param permanent Whether the leaves should be permanent and never decay.
     */
    public void setPermanent(boolean permanent) {
        byte data = getData();
        if (permanent) {
            data |= 0x4;
        } else {
            data &= ~0x4;
        }
        setData(data);
    }

    /**
     * @return True if the leaves are marked to be checked for decay.
     */
    public boolean isReadyForDecay() {
        return (getData() & 0x8) > 0;
    }

    /**
     * @param ready Whether the leaves should be checked for decay.
     */
    public void setReadyForDecay(boolean ready) {
        byte data = getData();
        if (ready) {
            data |= 0x8;
        } else {
            data &= ~0x8;
        }
        setData(data);
    }
}
