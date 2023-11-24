import math


def find_distance(x1, x2, y1, y2):
    return math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2)


def is_circumscribed(o_x, o_y, a_x, a_y, b_x, b_y, c_x, c_y, r):
    first_point_distance = find_distance(a_x, o_x, a_y, o_y)
    second_point_distance = find_distance(b_x, o_x, b_y, o_y)
    third_point_distance = find_distance(c_x, o_x, c_y, o_y)
    return (abs(first_point_distance - r) < 0.01) and \
           (abs(second_point_distance - r) < 0.01) and \
           (abs(third_point_distance - r) < 0.01)


def find_area(x1, x2, x3, y1, y2, y3):
    return abs(1/2 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)))


def is_circle_inside(a_x, a_y, b_x, b_y, c_x, c_y, o_x, o_y):
    first_triangle_area = find_area(a_x, b_x, o_x, a_y, b_y, o_y)
    second_triangle_area = find_area(a_x, o_x, c_x, a_y, o_y, c_y)
    third_triangle_area = find_area(o_x, b_x, c_x, o_y, b_y, c_y)
    whole_triangle_area = find_area(a_x, b_x, c_x, a_y, b_y, c_y)
    return abs(sum([first_triangle_area, second_triangle_area, third_triangle_area]) - whole_triangle_area) < 0.01


shape_pairs_count = int(input())

for _ in range(shape_pairs_count):
    circle_values = input()
    circle_values = circle_values.replace(' ', ', ', 1)
    o_x, o_y, r = [float(el) for el in circle_values.split(',')[1:]]

    triangle_values = input()
    triangle_values = triangle_values.replace(' ', ', ', 1)
    a_x, a_y, b_x, b_y, c_x, c_y = [float(el) for el in triangle_values.split(', ')[1:]]

    is_circumscribed = is_circumscribed(o_x, o_y, a_x, a_y, b_x, b_y, c_x, c_y, r)
    is_circle_inside = is_circle_inside(a_x, a_y, b_x, b_y, c_x, c_y, o_x, o_y)

    if is_circumscribed and is_circle_inside:
        print('The circle is circumscribed and the center is inside.')
    elif is_circumscribed and not is_circle_inside:
        print('The circle is circumscribed and the center is outside.')
    elif not is_circumscribed and is_circle_inside:
        print('The circle is not circumscribed and the center is inside.')
    else:
        print('The circle is not circumscribed and the center is outside.')