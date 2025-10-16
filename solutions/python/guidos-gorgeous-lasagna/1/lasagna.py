EXPECTED_BAKE_TIME = 40

def bake_time_remaining(remove):
    """Calculate the bake time remaining.

    :param remove: int - baking time already elapsed.
    :return: int - remaining bake time (in minutes).
    """
    new_bake_time = EXPECTED_BAKE_TIME - remove
    return new_bake_time


def preparation_time_in_minutes(number_of_layers):
    """Calculate the preparation time.

    :param number_of_layers: int - the number of layers in the lasagna.
    :return: int - total preparation time (in minutes).
    """
    return number_of_layers * 2


def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """Calculate the elapsed cooking time.

    :param number_of_layers: int - the number of layers in the lasagna.
    :param elapsed_bake_time: int - elapsed cooking time.
    :return: int - total time elapsed (in minutes) preparing and cooking.
    """
    return (number_of_layers * 2) + (elapsed_bake_time)