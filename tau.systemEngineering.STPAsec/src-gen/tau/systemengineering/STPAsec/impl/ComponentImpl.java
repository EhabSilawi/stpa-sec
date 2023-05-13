/**
 */
package tau.systemengineering.STPAsec.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tau.systemengineering.STPAsec.Command;
import tau.systemengineering.STPAsec.Component;
import tau.systemengineering.STPAsec.Feedback;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ComponentImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ComponentImpl#getDataFlow <em>Data Flow</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentImpl extends StructureElementImpl implements Component {
	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected Command command;

	/**
	 * The cached value of the '{@link #getDataFlow() <em>Data Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFlow()
	 * @generated
	 * @ordered
	 */
	protected Feedback dataFlow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command getCommand() {
		if (command != null && command.eIsProxy()) {
			InternalEObject oldCommand = (InternalEObject) command;
			command = (Command) eResolveProxy(oldCommand);
			if (command != oldCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, STPAsecPackage.COMPONENT__COMMAND,
							oldCommand, command));
			}
		}
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command basicGetCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(Command newCommand) {
		Command oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.COMPONENT__COMMAND, oldCommand,
					command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feedback getDataFlow() {
		if (dataFlow != null && dataFlow.eIsProxy()) {
			InternalEObject oldDataFlow = (InternalEObject) dataFlow;
			dataFlow = (Feedback) eResolveProxy(oldDataFlow);
			if (dataFlow != oldDataFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, STPAsecPackage.COMPONENT__DATA_FLOW,
							oldDataFlow, dataFlow));
			}
		}
		return dataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feedback basicGetDataFlow() {
		return dataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataFlow(Feedback newDataFlow) {
		Feedback oldDataFlow = dataFlow;
		dataFlow = newDataFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.COMPONENT__DATA_FLOW, oldDataFlow,
					dataFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case STPAsecPackage.COMPONENT__COMMAND:
			if (resolve)
				return getCommand();
			return basicGetCommand();
		case STPAsecPackage.COMPONENT__DATA_FLOW:
			if (resolve)
				return getDataFlow();
			return basicGetDataFlow();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case STPAsecPackage.COMPONENT__COMMAND:
			setCommand((Command) newValue);
			return;
		case STPAsecPackage.COMPONENT__DATA_FLOW:
			setDataFlow((Feedback) newValue);
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
		case STPAsecPackage.COMPONENT__COMMAND:
			setCommand((Command) null);
			return;
		case STPAsecPackage.COMPONENT__DATA_FLOW:
			setDataFlow((Feedback) null);
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
		case STPAsecPackage.COMPONENT__COMMAND:
			return command != null;
		case STPAsecPackage.COMPONENT__DATA_FLOW:
			return dataFlow != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl
