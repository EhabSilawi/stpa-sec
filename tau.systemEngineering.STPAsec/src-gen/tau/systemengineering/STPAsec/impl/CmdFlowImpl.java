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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import tau.systemengineering.STPAsec.CmdFlow;
import tau.systemengineering.STPAsec.ControlAction;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cmd Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.CmdFlowImpl#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.CmdFlowImpl#getPerformedBy <em>Performed By</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.CmdFlowImpl#getControledBy <em>Controled By</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.CmdFlowImpl#getCmd <em>Cmd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmdFlowImpl extends MinimalEObjectImpl.Container implements CmdFlow {
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
	 * The cached value of the '{@link #getPerformedBy() <em>Performed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedBy()
	 * @generated
	 * @ordered
	 */
	protected tau.systemengineering.STPAsec.System performedBy;

	/**
	 * The cached value of the '{@link #getControledBy() <em>Controled By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControledBy()
	 * @generated
	 * @ordered
	 */
	protected tau.systemengineering.STPAsec.System controledBy;

	/**
	 * The cached value of the '{@link #getCmd() <em>Cmd</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmd()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlAction> cmd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmdFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.CMD_FLOW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.CMD_FLOW__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tau.systemengineering.STPAsec.System getPerformedBy() {
		if (performedBy != null && performedBy.eIsProxy()) {
			InternalEObject oldPerformedBy = (InternalEObject) performedBy;
			performedBy = (tau.systemengineering.STPAsec.System) eResolveProxy(oldPerformedBy);
			if (performedBy != oldPerformedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, STPAsecPackage.CMD_FLOW__PERFORMED_BY,
							oldPerformedBy, performedBy));
			}
		}
		return performedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tau.systemengineering.STPAsec.System basicGetPerformedBy() {
		return performedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformedBy(tau.systemengineering.STPAsec.System newPerformedBy,
			NotificationChain msgs) {
		tau.systemengineering.STPAsec.System oldPerformedBy = performedBy;
		performedBy = newPerformedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.CMD_FLOW__PERFORMED_BY, oldPerformedBy, newPerformedBy);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformedBy(tau.systemengineering.STPAsec.System newPerformedBy) {
		if (newPerformedBy != performedBy) {
			NotificationChain msgs = null;
			if (performedBy != null)
				msgs = ((InternalEObject) performedBy).eInverseRemove(this, STPAsecPackage.SYSTEM__PERFORMS,
						tau.systemengineering.STPAsec.System.class, msgs);
			if (newPerformedBy != null)
				msgs = ((InternalEObject) newPerformedBy).eInverseAdd(this, STPAsecPackage.SYSTEM__PERFORMS,
						tau.systemengineering.STPAsec.System.class, msgs);
			msgs = basicSetPerformedBy(newPerformedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.CMD_FLOW__PERFORMED_BY, newPerformedBy,
					newPerformedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tau.systemengineering.STPAsec.System getControledBy() {
		if (controledBy != null && controledBy.eIsProxy()) {
			InternalEObject oldControledBy = (InternalEObject) controledBy;
			controledBy = (tau.systemengineering.STPAsec.System) eResolveProxy(oldControledBy);
			if (controledBy != oldControledBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, STPAsecPackage.CMD_FLOW__CONTROLED_BY,
							oldControledBy, controledBy));
			}
		}
		return controledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tau.systemengineering.STPAsec.System basicGetControledBy() {
		return controledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControledBy(tau.systemengineering.STPAsec.System newControledBy,
			NotificationChain msgs) {
		tau.systemengineering.STPAsec.System oldControledBy = controledBy;
		controledBy = newControledBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.CMD_FLOW__CONTROLED_BY, oldControledBy, newControledBy);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControledBy(tau.systemengineering.STPAsec.System newControledBy) {
		if (newControledBy != controledBy) {
			NotificationChain msgs = null;
			if (controledBy != null)
				msgs = ((InternalEObject) controledBy).eInverseRemove(this, STPAsecPackage.SYSTEM__CONTROLS,
						tau.systemengineering.STPAsec.System.class, msgs);
			if (newControledBy != null)
				msgs = ((InternalEObject) newControledBy).eInverseAdd(this, STPAsecPackage.SYSTEM__CONTROLS,
						tau.systemengineering.STPAsec.System.class, msgs);
			msgs = basicSetControledBy(newControledBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.CMD_FLOW__CONTROLED_BY, newControledBy,
					newControledBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlAction> getCmd() {
		if (cmd == null) {
			cmd = new EObjectResolvingEList<ControlAction>(ControlAction.class, this, STPAsecPackage.CMD_FLOW__CMD);
		}
		return cmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case STPAsecPackage.CMD_FLOW__PERFORMED_BY:
			if (performedBy != null)
				msgs = ((InternalEObject) performedBy).eInverseRemove(this, STPAsecPackage.SYSTEM__PERFORMS,
						tau.systemengineering.STPAsec.System.class, msgs);
			return basicSetPerformedBy((tau.systemengineering.STPAsec.System) otherEnd, msgs);
		case STPAsecPackage.CMD_FLOW__CONTROLED_BY:
			if (controledBy != null)
				msgs = ((InternalEObject) controledBy).eInverseRemove(this, STPAsecPackage.SYSTEM__CONTROLS,
						tau.systemengineering.STPAsec.System.class, msgs);
			return basicSetControledBy((tau.systemengineering.STPAsec.System) otherEnd, msgs);
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
		case STPAsecPackage.CMD_FLOW__PERFORMED_BY:
			return basicSetPerformedBy(null, msgs);
		case STPAsecPackage.CMD_FLOW__CONTROLED_BY:
			return basicSetControledBy(null, msgs);
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
		case STPAsecPackage.CMD_FLOW__ID:
			return getId();
		case STPAsecPackage.CMD_FLOW__PERFORMED_BY:
			if (resolve)
				return getPerformedBy();
			return basicGetPerformedBy();
		case STPAsecPackage.CMD_FLOW__CONTROLED_BY:
			if (resolve)
				return getControledBy();
			return basicGetControledBy();
		case STPAsecPackage.CMD_FLOW__CMD:
			return getCmd();
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
		case STPAsecPackage.CMD_FLOW__ID:
			setId((Integer) newValue);
			return;
		case STPAsecPackage.CMD_FLOW__PERFORMED_BY:
			setPerformedBy((tau.systemengineering.STPAsec.System) newValue);
			return;
		case STPAsecPackage.CMD_FLOW__CONTROLED_BY:
			setControledBy((tau.systemengineering.STPAsec.System) newValue);
			return;
		case STPAsecPackage.CMD_FLOW__CMD:
			getCmd().clear();
			getCmd().addAll((Collection<? extends ControlAction>) newValue);
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
		case STPAsecPackage.CMD_FLOW__ID:
			setId(ID_EDEFAULT);
			return;
		case STPAsecPackage.CMD_FLOW__PERFORMED_BY:
			setPerformedBy((tau.systemengineering.STPAsec.System) null);
			return;
		case STPAsecPackage.CMD_FLOW__CONTROLED_BY:
			setControledBy((tau.systemengineering.STPAsec.System) null);
			return;
		case STPAsecPackage.CMD_FLOW__CMD:
			getCmd().clear();
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
		case STPAsecPackage.CMD_FLOW__ID:
			return id != ID_EDEFAULT;
		case STPAsecPackage.CMD_FLOW__PERFORMED_BY:
			return performedBy != null;
		case STPAsecPackage.CMD_FLOW__CONTROLED_BY:
			return controledBy != null;
		case STPAsecPackage.CMD_FLOW__CMD:
			return cmd != null && !cmd.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //CmdFlowImpl
