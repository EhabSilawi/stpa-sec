/**
 */
package tau.systemengineering.STPAsec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tau.systemengineering.STPAsec.ControlAction;
import tau.systemengineering.STPAsec.STPAsecPackage;
import tau.systemengineering.STPAsec.System;
import tau.systemengineering.STPAsec.SystemLevelHazard;
import tau.systemengineering.STPAsec.TypeOfUnsecureControlAction;
import tau.systemengineering.STPAsec.UnsecureControlAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unsecure Control Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.UnsecureControlActionImpl#getSyaSource <em>Sya Source</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.UnsecureControlActionImpl#getType <em>Type</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.UnsecureControlActionImpl#getContext <em>Context</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.UnsecureControlActionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.UnsecureControlActionImpl#getLinkToHazrd <em>Link To Hazrd</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.UnsecureControlActionImpl#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.UnsecureControlActionImpl#getControlAction <em>Control Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnsecureControlActionImpl extends MinimalEObjectImpl.Container implements UnsecureControlAction {
	/**
	 * The cached value of the '{@link #getSyaSource() <em>Sya Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyaSource()
	 * @generated
	 * @ordered
	 */
	protected tau.systemengineering.STPAsec.System syaSource;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeOfUnsecureControlAction TYPE_EDEFAULT = TypeOfUnsecureControlAction.NOT_PROVIDED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeOfUnsecureControlAction type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected tau.systemengineering.STPAsec.System source;

	/**
	 * The cached value of the '{@link #getLinkToHazrd() <em>Link To Hazrd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkToHazrd()
	 * @generated
	 * @ordered
	 */
	protected SystemLevelHazard linkToHazrd;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getControlAction() <em>Control Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlAction()
	 * @generated
	 * @ordered
	 */
	protected ControlAction controlAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnsecureControlActionImpl() {
		super();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tau.systemengineering.STPAsec.System basicGetSyaSource() {
		return syaSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfUnsecureControlAction getType() {
		return type;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContext() {
		return context;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tau.systemengineering.STPAsec.System basicGetSource() {
		return source;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemLevelHazard basicGetLinkToHazrd() {
		return linkToHazrd;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkToHazrd(SystemLevelHazard newLinkToHazrd) {
		if (newLinkToHazrd != linkToHazrd) {
			NotificationChain msgs = null;
			if (linkToHazrd != null)
				msgs = ((InternalEObject) linkToHazrd).eInverseRemove(this, STPAsecPackage.SYSTEM_LEVEL_HAZARD__ICA,
						SystemLevelHazard.class, msgs);
			if (newLinkToHazrd != null)
				msgs = ((InternalEObject) newLinkToHazrd).eInverseAdd(this, STPAsecPackage.SYSTEM_LEVEL_HAZARD__ICA,
						SystemLevelHazard.class, msgs);
	
			if (msgs != null)
				msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAction basicGetControlAction() {
		return controlAction;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", context: ");
		result.append(context);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}


	@Override
	public System getSyaSource() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setSyaSource(System value) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setType(TypeOfUnsecureControlAction value) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setContext(String value) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public System getSource() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setSource(System value) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public SystemLevelHazard getLinkToHazrd() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setId(int value) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public ControlAction getControlAction() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setControlAction(ControlAction value) {
		// TODO Auto-generated method stub
		
	}

} //UnsecureControlActionImpl
