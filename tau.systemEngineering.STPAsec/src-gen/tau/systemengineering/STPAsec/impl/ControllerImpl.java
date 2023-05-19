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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import tau.systemengineering.STPAsec.ControlAction;
import tau.systemengineering.STPAsec.Controller;
import tau.systemengineering.STPAsec.Feedback;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControllerImpl#getType <em>Type</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControllerImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControllerImpl#getFeedbacks <em>Feedbacks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerImpl extends StructureElementImpl implements Controller {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlAction> commands;

	/**
	 * The cached value of the '{@link #getFeedbacks() <em>Feedbacks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbacks()
	 * @generated
	 * @ordered
	 */
	protected EList<Feedback> feedbacks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.CONTROLLER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlAction> getCommands() {
		if (commands == null) {
			commands = new EObjectWithInverseResolvingEList<ControlAction>(ControlAction.class, this,
					STPAsecPackage.CONTROLLER__COMMANDS, STPAsecPackage.CONTROL_ACTION__RECEIVER);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feedback> getFeedbacks() {
		if (feedbacks == null) {
			feedbacks = new EObjectWithInverseResolvingEList<Feedback>(Feedback.class, this,
					STPAsecPackage.CONTROLLER__FEEDBACKS, STPAsecPackage.FEEDBACK__CONTROLLER);
		}
		return feedbacks;
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
		case STPAsecPackage.CONTROLLER__COMMANDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCommands()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.CONTROLLER__FEEDBACKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFeedbacks()).basicAdd(otherEnd, msgs);
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
		case STPAsecPackage.CONTROLLER__COMMANDS:
			return ((InternalEList<?>) getCommands()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROLLER__FEEDBACKS:
			return ((InternalEList<?>) getFeedbacks()).basicRemove(otherEnd, msgs);
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
		case STPAsecPackage.CONTROLLER__TYPE:
			return getType();
		case STPAsecPackage.CONTROLLER__COMMANDS:
			return getCommands();
		case STPAsecPackage.CONTROLLER__FEEDBACKS:
			return getFeedbacks();
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
		case STPAsecPackage.CONTROLLER__TYPE:
			setType((String) newValue);
			return;
		case STPAsecPackage.CONTROLLER__COMMANDS:
			getCommands().clear();
			getCommands().addAll((Collection<? extends ControlAction>) newValue);
			return;
		case STPAsecPackage.CONTROLLER__FEEDBACKS:
			getFeedbacks().clear();
			getFeedbacks().addAll((Collection<? extends Feedback>) newValue);
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
		case STPAsecPackage.CONTROLLER__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case STPAsecPackage.CONTROLLER__COMMANDS:
			getCommands().clear();
			return;
		case STPAsecPackage.CONTROLLER__FEEDBACKS:
			getFeedbacks().clear();
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
		case STPAsecPackage.CONTROLLER__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case STPAsecPackage.CONTROLLER__COMMANDS:
			return commands != null && !commands.isEmpty();
		case STPAsecPackage.CONTROLLER__FEEDBACKS:
			return feedbacks != null && !feedbacks.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ControllerImpl
