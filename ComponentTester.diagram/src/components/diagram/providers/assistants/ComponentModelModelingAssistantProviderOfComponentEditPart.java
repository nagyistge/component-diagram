package components.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import components.diagram.providers.ComponentModelElementTypes;
import components.diagram.providers.ComponentModelModelingAssistantProvider;

/**
 * @generated
 */
public class ComponentModelModelingAssistantProviderOfComponentEditPart
		extends ComponentModelModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ComponentModelElementTypes.Port_2001);
		types.add(ComponentModelElementTypes.Component_2002);
		return types;
	}

}
