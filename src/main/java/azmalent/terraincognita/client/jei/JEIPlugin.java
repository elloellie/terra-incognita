package azmalent.terraincognita.client.jei;

import azmalent.terraincognita.TIConfig;
import azmalent.terraincognita.TerraIncognita;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaRecipeCategoryUid;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nonnull;

@JeiPlugin
@OnlyIn(Dist.CLIENT)
public class JEIPlugin implements IModPlugin {
    @Nonnull
    @Override
    public ResourceLocation getPluginUid() {
        return TerraIncognita.prefix("jei");
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        if (TIConfig.Flora.wreath.get()) {
            registration.addRecipes(WreathRecipeMaker.getRecipes(), VanillaRecipeCategoryUid.CRAFTING);
        }
    }
}
