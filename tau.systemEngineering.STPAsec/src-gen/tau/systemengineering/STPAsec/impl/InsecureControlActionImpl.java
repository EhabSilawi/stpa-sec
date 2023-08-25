/**
 */
package tau.systemengineering.STPAsec.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tau.systemengineering.STPAsec.CmdFlow;
import tau.systemengineering.STPAsec.ControlAction;
import tau.systemengineering.STPAsec.InsecureControlAction;
import tau.systemengineering.STPAsec.STPAsecPackage;
import tau.systemengineering.STPAsec.SystemLevelHazard;
import tau.systemengineering.STPAsec.TypeOfUnsecureControlAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insecure Control Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.InsecureControlActionImpl#getType <em>Type</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.InsecureControlActionImpl#getContext <em>Context</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.InsecureControlActionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.InsecureControlActionImpl#getLinkToHazrd <em>Link To Hazrd</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.InsecureControlActionImpl#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.InsecureControlActionImpl#getControlAction <em>Control Action</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.InsecureControlActionImpl#getCmdflow <em>Cmdflow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsecureControlActionImpl extends MinimalEObjectImpl.Container implements InsecureControlAction {
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
	 * The cached value of the '{@link #getLinkToHazrd() <em>Link To Hazrd</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkToHazrd()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemLevelHazard> linkToHazrd;

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
	 * The cached value of the '{@link #getCmdflow() <em>Cmdflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmdflow()
	 * @generated
	 * @ordered
	 */
	protected CmdFlow cmdflow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsecureControlActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.INSECURE_CONTROL_ACTION;
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
	public void setType(TypeOfUnsecureControlAction newType) {
		TypeOfUnsecureControlAction oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.INSECURE_CONTROL_ACTION__TYPE, oldType,
					type));
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
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.INSECURE_CONTROL_ACTION__CONTEXT,
					oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tau.systemengineering.STPAsec.System getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (tau.systemengineering.STPAsec.System) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							STPAsecPackage.INSECURE_CONTROL_ACTION__SOURCE, oldSource, source));
			}
		}
		return source;
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
	public void setSource(tau.systemengineering.STPAsec.System newSource) {
		tau.systemengineering.STPAsec.System oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.INSECURE_CONTROL_ACTION__SOURCE,
					oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemLevelHazard> getLinkToHazrd() {
		if (linkToHazrd == null) {
			linkToHazrd = new EObjectWithInverseResolvingEList.ManyInverse<SystemLevelHazard>(SystemLevelHazard.class,
					this, STPAsecPackage.INSECURE_CONTROL_ACTION__LINK_TO_HAZRD,
					STPAsecPackage.SYSTEM_LEVEL_HAZARD__ICA);
		}
		return linkToHazrd;
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
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.INSECURE_CONTROL_ACTION__ID, oldId,
					id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAction getControlAction() {
		if (controlAction != null && controlAction.eIsProxy()) {
			InternalEObject oldControlAction = (InternalEObject) controlAction;
			controlAction = (ControlAction) eResolveProxy(oldControlAction);
			if (controlAction != oldControlAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							STPAsecPackage.INSECURE_CONTROL_ACTION__CONTROL_ACTION, oldControlAction, controlAction));
			}
		}
		return controlAction;
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
	public void setControlAction(ControlAction newControlAction) {
		ControlAction oldControlAction = controlAction;
		controlAction = newControlAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.INSECURE_CONTROL_ACTION__CONTROL_ACTION, oldControlAction, controlAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdFlow getCmdflow() {
		if (cmdflow != null && cmdflow.eIsProxy()) {
			InternalEObject oldCmdflow = (InternalEObject) cmdflow;
			cmdflow = (CmdFlow) eResolveProxy(oldCmdflow);
			if (cmdflow != oldCmdflow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							STPAsecPackage.INSECURE_CONTROL_ACTION__CMDFLOW, oldCmdflow, cmdflow));
			}
		}
		return cmdflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdFlow basicGetCmdflow() {
		return cmdflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmdflow(CmdFlow newCmdflow) {
		CmdFlow oldCmdflow = cmdflow;
		cmdflow = newCmdflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.INSECURE_CONTROL_ACTION__CMDFLOW,
					oldCmdflow, cmdflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case STPAsecPackage.INSECURE_CONTROL_ACTION__LINK_TO_HAZRD:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinkToHazrd()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case STPAsecPackage.INSECURE_CONTROL_ACTION__LINK_TO_HAZRD:
			return ((InternalEList<?>) getLinkToHazrd()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case STPAsecPackage.INSECURE_CONTROL_ACTION__TYPE:
			return getType();
		case STPAsecPackage.INSECURE_CONTROL_ACTION__CONTEXT:
			return getContext();
		case STPAsecPackage.INSECURE_CONTROL_ACTION__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case STPAsecPackage.INSECURE_CONTROL_ACTION__LINK_TO_HAZRD:
			return getLinkToHazrd();
		case STPAsecPackage.INSECURE_CONTROL_ACTION__ID:
			return getId();
		case STPAsecPackage.INSECURE_CONTROL_ACTION__CONTROL_ACTION:
			if (resolve)
				return getControlAction();
			return basicGetControlAction();
		case STPAsecPackage.INSECURE_CONTROL_ACTION__CMDFLOW:
			if (resolve)
				return getCmdflow();
			return basicGetCmdflow();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case STPAsecPackage.INSECURE_CONTROL_ACTION__TYPE:
			setType((TypeOfUnsecureControlAction) newValue);
			return;
		case STPAsecPackage.INSECURE_CONTROL_ACTION__CONTEXT:
			setContext((String) newValue);
			return;
		case STPAsecPackage.INSECURE_CONTROL_ACTION__SOURCE:
			setSource((tau.systemengineering.STPAsec.System) newValue);
			return;
		case STPAsecPackage.INSECURE_CONTROL_ACTION__LINK_TO_HAZRD:
			getLinkToHazrd().clear();
			getLinkToHazrd().addAll((Collection<? extends SystemLevelHazard>) newValue);
			return;
		case STPAsecPackage.INSECURE_CONTROL_ACTION__ID:
			setId((Integer) newValue);
			return;
		case STPAsecPackage.INSECURE_CONTROL_ACTION__CONTROL_ACTION:
			setControlAction((ControlAction) newValue);
			return;
		case STPAsecPackage.INSECURE_CONTROL_ACTION__CMDFLOW:
			setCmdflow((CmdFlow) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case STPAsecPackage.INSECURE_CONTROL_ACTION__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case STPAsecPackage.INSECURE_CONTROL_ACTION__CONTEXT:
			setContext(CONTEXT_EDEFAULT);
			return;
		case STPAsecPackage.INSECURE_CONTROL_ACTION__SOURCE:
			setSource((tau.systemengineering.STPAsec.System) null);
			return;
		case STPAsecPackage.INSECURE_CONTROL_ACTION__LINK_TO_HAZRD:
			getLinkToHazrd().clear();
			return;
		case STPAsecPackage.INSECURE_CONTROL_ACTION__ID:
			setId(ID_EDEFAULT);
			return;
		case STPAsecPackage.INSECURE_CONTROL_ACTION__CONTROL_ACTION:
			setControlAction((ControlAction) null);
			return;
		case STPAsecPackage.INSECURE_CONTROL_ACTION__CMDFLOW:
			setCmdflow((CmdFlow) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case STPAsecPackage.INSECURE_CONTROL_ACTION__TYPE:
			return type != TYPE_EDEFAULT;
		case STPAsecPackage.INSECURE_CONTROL_ACTION__CONTEXT:
			return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
		case STPAsecPackage.INSECURE_CONTROL_ACTION__SOURCE:
			return source != null;
		case STPAsecPackage.INSECURE_CONTROL_ACTION__LINK_TO_HAZRD:
			return linkToHazrd != null && !linkToHazrd.isEmpty();
		case STPAsecPackage.INSECURE_CONTROL_ACTION__ID:
			return id != ID_EDEFAULT;
		case STPAsecPackage.INSECURE_CONTROL_ACTION__CONTROL_ACTION:
			return controlAction != null;
		case STPAsecPackage.INSECURE_CONTROL_ACTION__CMDFLOW:
			return cmdflow != null;
		}
		return super.eIsSet(featureID);
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

} //InsecureControlActionImpl
